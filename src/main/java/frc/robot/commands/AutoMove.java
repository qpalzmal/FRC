/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class AutoMove extends TimedCommand {
  /**
   * Add your docs here.
   */

  private double time;
  private double leftSpeed;
  private double rightSpeed;

  public AutoMove(double timeout, double initLeftSpeed, double initRightSpeed) {
    super(timeout);
    time = timeout;
    leftSpeed = initLeftSpeed;
    rightSpeed = initRightSpeed;
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.driveTrain.setLeftMotors(leftSpeed);
    Robot.driveTrain.setRightMotors(rightSpeed);
    setTimeout(time);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Called once after timeout
  @Override
  protected void end() {
  Robot.driveTrain.setLeftMotors(0);
  Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
