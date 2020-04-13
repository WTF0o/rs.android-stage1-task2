package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        return if (searhByStr(a, b)) return "YES"
        else if (searhByLetter(a, b)) "YES"
        else "NO"
    }

    fun searhByStr(a: String, b: String): Boolean {

        return a.contains(b, true)

    }

    fun searhByLetter(a: String, b: String): Boolean {

        var pIndex:Int = 0
        var cIndex:Int = 0

        for (index in b.indices){
            cIndex = a.indexOf(b[index],0,true)
            if( cIndex != -1 && cIndex > pIndex) {
                pIndex = cIndex
                continue
            }
            else return false

        }

        return true
    }
}
