package MyExcercise;

import java.util.List;

public class BuildingAddress {

    List<BuildingObject.Room> rooms;
    class Room {}
}

class BuildingObject {

    String address;

    class Room {
        String getBuildingAddress() {
            return  BuildingObject.this.address;
        }
    }
}
