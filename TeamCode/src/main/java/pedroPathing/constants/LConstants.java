package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        TwoWheelConstants.forwardTicksToInches = .0021;
        TwoWheelConstants.strafeTicksToInches = 0.0021;
        TwoWheelConstants.forwardY = -5.625;
        TwoWheelConstants.strafeX = -1.625;
        // @TODO plug in odo(3 for foward odo and 0 for imu)>
        TwoWheelConstants.forwardEncoder_HardwareMapName = "leftShift";
        TwoWheelConstants.strafeEncoder_HardwareMapName = "foward";
        // @TODO Check for reverse
        TwoWheelConstants.forwardEncoderDirection = Encoder.FORWARD;
        TwoWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
        TwoWheelConstants.IMU_HardwareMapName = "imu";
        // @TODO Check the orientation is right later
        // @TODO Put IMU as port zero on control hub(refer to doc)
        TwoWheelConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.LEFT, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);

    }
}




