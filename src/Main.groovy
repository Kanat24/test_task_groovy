static void main(String[] args) {
    def myList = [1, 2, 3, 2, 1, 3, 4, 5, 4, 1, 4, 3, 3]
    def result = countElements(myList)
    println(result)
}

static def countElements(list) {
    def resultMap = [:]
    list.each { element ->
        resultMap[element] = resultMap.getOrDefault(element, 0) + 1
    }
    return resultMap
}