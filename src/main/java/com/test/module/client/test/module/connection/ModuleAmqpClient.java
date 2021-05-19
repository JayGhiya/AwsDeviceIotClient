package com.test.module.client.test.module.connection;

import com.microsoft.azure.sdk.iot.device.DeviceClient;
import com.microsoft.azure.sdk.iot.device.IotHubClientProtocol;

import java.net.URISyntaxException;

public class ModuleAmqpClient {

    private DeviceClient deviceClient;

    public ModuleAmqpClient(String connectionString, IotHubClientProtocol iotHubClientProtocol)
    {

        try {
            DeviceClient deviceClient = new DeviceClient(connectionString,iotHubClientProtocol);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage()
    {
        //todo

    }

}
