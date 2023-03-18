package mai.dep810.noslq.rep
import mai.dep810.noslq.model.Data
import mai.dep810.noslq.model.Data.Room
import org.springframework.stereotype.Repository


@Repository("roomrepository")

class Roomrepository {

    private val rooms: MutableList<Room> = mutableListOf(

    )

    fun findAll(): List<Room> = rooms;
    fun findById(room_id : String): Room?=rooms.singleOrNull{it.room_id==room_id}

    fun addRoom(room: Room){
        if(!rooms.contains(room)){
            rooms.add(room)
        }
    }

    fun deleteRoom(room_id: String)=rooms.removeIf{it.room_id==room_id}

}