package service

import entity.Adopter

interface AdopterService {

    fun addAdopters(listArtists: List<Adopter>)
    fun searchAdopters(letter: String): List<Adopter>
    fun searchAdoptersByName(name: String): List<Adopter>

}