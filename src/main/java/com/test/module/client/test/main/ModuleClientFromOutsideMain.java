package com.test.module.client.test.main;

import com.microsoft.azure.sdk.iot.device.IotHubClientProtocol;
import com.test.module.client.test.module.connection.ModuleAmqpClient;
import org.bouncycastle.math.raw.Mod;

public class ModuleClientFromOutsideMain {

    private  static final String connectionString = "HostName=devreli.azure-devices.net;DeviceId=myFirstDevice;SharedAccessKey=lE/sA3cDCsbCNiqiGP8+NrSJNn5yr54231mPkUDZstE=";

    public static void main(String[] args)
    {
        ModuleAmqpClient moduleAmqpClient = new ModuleAmqpClient(connectionString, IotHubClientProtocol.AMQPS);



    }
}
