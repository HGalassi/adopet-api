package entity


import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import javax.persistence.*

@Entity
@Table(name = "adopters")
data class Adopter (@Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    var id: Int,
                    var name: String) : PanacheEntityBase {

    companion object : PanacheCompanion<Adopter> {
        fun findByNameStartsWith(letter: String) = list("name LIKE '$letter%'")
        fun findAllByName(name: String) = list("name LIKE '$name'")
    }


}