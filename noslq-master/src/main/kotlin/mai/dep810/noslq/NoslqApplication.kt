package mai.dep810.noslq

import mai.dep810.noslq.model.Data
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File
import java.io.FileInputStream

@SpringBootApplication
class NoslqApplication
	fun main(args: Array<String>) {
		runApplication<NoslqApplication>(*args)

	val inputStream = FileInputStream(File("D:\\download\\noslq-master\\noslq-master\\src\\main\\kotlin\\mai\\dep810\\noslq\\database\\clients.csv"))
		val clients= Data.readCsv(inputStream)
		clients.forEach{
			println(it)
		}
	/*	val inputStr = FileInputStream(File("D:\\download\\data\\books.csv"))
		val books= Data.readC((inputStr))
		books.forEach {
			println(it)
		}*/
	}
