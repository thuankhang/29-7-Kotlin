fun feast(beast: String, dish: String): Boolean {
    if(beast.get(0) == dish.get(0) && beast.get(beast.length-1) == dish.get(dish.length-1)) {
        return true
    }
    else return false
}