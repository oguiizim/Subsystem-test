package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ShooterTestCmd;

public class ShooterTest extends SubsystemBase{
    // 
    CANSparkMax pidTest;
    RelativeEncoder pidEncoder;
    double error;
    XboxController controle;

    public ShooterTest(){

        CANSparkMax pidTest = new CANSparkMax(14, MotorType.kBrushless);
        pidEncoder = pidTest.getEncoder();
        
    }

    double getError(double setpoint){
        return error = pidEncoder.getPosition() - setpoint;
    }

    public void pidTest(){

    }

    public void motor(){
        pidTest.set(0.2);
    }

    public void stop(){
        pidTest.stopMotor();
    }

    boolean getButton(){
        // Button dpadDownButton = new Button(() -> driverController.getPOV() == 180);
        if(controle.getPOV() == 180){
            return true;
        }
        return false;
    }

}
