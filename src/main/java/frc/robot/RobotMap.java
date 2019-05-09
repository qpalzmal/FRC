/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

// Values currently set to null will cause a compilation error
public class RobotMap {
  // Ports for the motors - test the driver station
  public static final int LEFT_MOTOR_1 = null;
  public static final int LEFT_MOTOR_2 = null;
	public static final int RIGHT_MOTOR_1 = null;
  public static final int RIGHT_MOTOR_2 = null;
  

  // Port that the controller will be connected to
  // Port will most likely be 0, 1, or 2 - check the driver station
  public static final int CONTROLLER_PORT = 0;
  
  // The axis of controller sticks - test controller in driver station
  // public static final int LEFT_STICK_CONTROLLER_X_AXIS = null;
  public static final int LEFT_STICK_CONTROLLER_Y_AXIS = null;

  public static final int RIGHT_STICK_CONTROLLER_X_AXIS = null;
  // public static final int RIGHT_STICK_CONTROLLER_Y_AXIS = null;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
