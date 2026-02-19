package frc.robot;

import java.util.Optional;

import com.ctre.phoenix6.swerve.SwerveRequest;
import com.ctre.phoenix6.swerve.SwerveModule.DriveRequestType;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj2.command.InstantCommand;
public class Binds {


			
			
			   
			
// public static final class DriverStation2026 {
// 	static {
// 		DriverStation.silenceJoystickConnectionWarning(true);
// 		}
			
			
// 	public static final void bind() {
// 					// Map Joysticks
// 		Swerve.get().setDefaultCommand(Swerve.get().applyRequest(
// 			() -> swerveFCDriveRequest.withVelocityX(Math.pow(HumanControls.DriverPanel.leftJoyY.getAsDouble(), 2))
// 				.withVelocityY(Math.pow(HumanControls.DriverPanel.leftJoyX.getAsDouble(), 2))
// 				.withRotationalRate(Math.pow(HumanControls.DriverPanel.rightJoyX.getAsDouble(), 2))));
			
// 			// Reset Gyro
// 			HumanControls.DriverPanel.resetGyro.onTrue(new InstantCommand(() -> Swerve.get().seedFieldCentric()));
// 		}
// 	}
			
			
			
public static final class Controller {
	static {
		DriverStation.silenceJoystickConnectionWarning(true);
		}
	
	//Xbox controller methods, simplifies and cleans up the bind() method a lot
	// private static double getDriveForward() {
	// 	return Math.pow(HumanControls.SingleXboxController.leftJoyY.getAsDouble(), 2) * Math.signum(HumanControls.SingleXboxController.leftJoyY.getAsDouble());
	// }
	
	// private static double getDriveRight() {
	// 	return Math.pow(HumanControls.SingleXboxController.leftJoyX.getAsDouble(), 2) * Math.signum(HumanControls.SingleXboxController.leftJoyX.getAsDouble());
	// }
	// private static double getRotationClockwise() {
	// 	return Math.pow(HumanControls.SingleXboxController.rightJoyX.getAsDouble(), 2) * Math.signum(HumanControls.SingleXboxController.rightJoyX.getAsDouble());
	// }	
			
	public static final void bind() {
	// 	Swerve.get().setDefaultCommand(Swerve.get().applyRequest(
	// 		() -> swerveFCDriveRequest
	// 		.withVelocityX(getDriveForward())
	// 		.withVelocityY(getDriveRight())
	// 		.withRotationalRate(getRotationClockwise()))); //Standard driving

            HumanControls.SingleXboxController.A.whileTrue(shooter.get().Shoot(-90.0, 0.0));
			//HumanControls.SingleXboxController.A.onFalse(shooter.get().Stop());
	}
	
				
		}
	}

