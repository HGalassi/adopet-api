package controller

import entity.Adopter
import service.AdopterService
import javax.transaction.Transactional
import javax.ws.rs.POST
import javax.ws.rs.Path

@Path("")
class AdopterController (private val adopterService: AdopterService) {

    @POST
    @Path("/add")
    @Transactional
    fun addArtist(listAdopters: List<Adopter>) = adopterService.addAdopters(listAdopters)

}