package service.impl

import entity.Adopter
import service.AdopterService
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class AdopterServiceImpl : AdopterService {

    override fun addAdopters(listAdopters: List<Adopter>) {
        Adopter.persist(listAdopters)
    }

    override fun searchAdopters(letter: String) = Adopter.findAllByName("Heitor")

    override fun searchAdoptersByName(name: String): List<Adopter> {
        TODO("Not yet implemented")
    }
}

//GRANT ALL PRIVILEGES ON adopet_api.* TO 'heitor'@'localhost';