package com.aitextras.data.schema.door.ecto;

import loqor.ait.client.models.doors.PoliceBoxDoorModel;
import loqor.ait.client.models.doors.DoorModel;
import loqor.ait.data.schema.door.ClientDoorSchema;
import com.aitextras.client.models.doors.EctoDoorModel;

public class ClientEctoDoorVariant extends ClientDoorSchema {
    public ClientEctoDoorVariant() {
        super(EctoDoorVariant.REFERENCE);
    }

    public DoorModel model() {
        return new EctoDoorModel(PoliceBoxDoorModel.getTexturedModelData().createModel());
    }
}