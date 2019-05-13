/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveControls;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Constructor that inverts the motors so they spin in sync
  public DriveTrain () {
    this.leftMotor1.setInverted(true);
    this.leftMotor2.setInverted(true);
  }

  private TalonSRX leftMotor1 = new TalonSRX(RobotMap.LEFT_MOTOR_1);
  private TalonSRX leftMotor2 = new TalonSRX(RobotMap.LEFT_MOTOR_2);
  private TalonSRX rightMotor1 = new TalonSRX(RobotMap.RIGHT_MOTOR_1);
  private TalonSRX rightMotor2 = new TalonSRX(RobotMap.RIGHT_MOTOR_2);

  // Put methods for controlling this subsystem here.
  // Call these from Commands.
  public void setLeftMotors(double speed) {
    leftMotor1.set(ControlMode.PercentOutput, speed);
    leftMotor2.set(ControlMode.PercentOutput, speed);
  }

  public void setRightMotors(double speed) {
    rightMotor1.set(ControlMode.PercentOutput, speed);
    rightMotor2.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveControls());
  }
}
