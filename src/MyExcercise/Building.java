package MyExcercise;

public class Building {
    Room createAnonymousRoom(){
        return new Room() {
            @Override
            public void doInRoom() {}
        };
    }

    Room createIntLineRoom() {
        class IntLineRoom implements Room {
            @Override
            public void doInRoom() {
            }
        }
        return new IntLineRoom();
    }

    Room createLambdaRoom() {
        return  () -> {};
}
interface  Room {
   void doInRoom();
    }
}
