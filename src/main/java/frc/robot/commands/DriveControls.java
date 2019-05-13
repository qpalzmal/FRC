/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class DriveControls extends Command {
  public DriveControls() {
    // Use requires() here to declare subsystem dependencies
    // Must refer to the instance of the subsystem dependency
    // eg. requires(chassis);
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
        // The signs may need to be switched - requires physical testing
    // Controls for driving the drivetrain - using left stick on controller
    double leftStickY = Robot.m_oi.getControllerAxis(RobotMap.LEFT_STICK_CONTROLLER_Y_AXIS);
    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(leftStickY); 

    // Controls for turning the drivetrain - using right stick on controller
    double rightStickX = Robot.m_oi.getControllerAxis(RobotMap.RIGHT_STICK_CONTROLLER_X_AXIS);
    Robot.driveTrain.setLeftMotors(-rightStickX);
    Robot.driveTrain.setRightMotors(rightStickX);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    // Makes sure the drivetrain stops moving
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    // Makes sure the drivetrain stops moving
    this.end();
  }
}
