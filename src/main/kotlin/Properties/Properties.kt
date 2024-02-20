package Properties

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(a){
            counter++
            field = a
        }
}