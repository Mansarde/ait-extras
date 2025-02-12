package com.aitextras.data.schema.door.ecto;

import dev.amble.ait.client.models.doors.PoliceBoxDoorModel;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.data.schema.door.ClientDoorSchema;
import com.aitextras.client.models.doors.EctoDoorModel;

public class ClientEctoDoorVariant extends ClientDoorSchema {
    public ClientEctoDoorVariant() {
        super(EctoDoorVariant.REFERENCE);
    }

    public DoorModel model() {
        return new EctoDoorModel(PoliceBoxDoorModel.getTexturedModelData().createModel());
    }
}