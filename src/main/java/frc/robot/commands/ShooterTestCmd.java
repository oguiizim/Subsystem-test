package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterTest;

public class ShooterTestCmd extends Command{
    
    ShooterTest shooter;
    XboxController controle;

    public ShooterTestCmd(ShooterTest subsystem, XboxController controle){
        shooter = subsystem;
        this.controle = controle;

        addRequirements(subsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        if(controle.getPOV() == 180){
            shooter.motor();
        } else {
            shooter.stop();
        }
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
