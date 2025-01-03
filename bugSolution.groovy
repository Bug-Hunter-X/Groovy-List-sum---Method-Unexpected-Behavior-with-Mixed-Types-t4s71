def list = [1, 2, 3, 4, 5]

println list.sum()

list = ["a", "b", "c"]

try {
    println list.sum()
} catch (MissingMethodException e) {
    println "Error: Cannot sum strings directly.  Using alternative approach."
    println list.join()
}

//Alternative to handle mixed data types
def mixedList = [1, 2, "a", 3, "b", 4, 5]
def numericSum = mixedList.findAll { it instanceof Integer }.sum()
def stringConcat = mixedList.findAll { it instanceof String }.join("")
println "Numeric sum: ${numericSum}"
println "String concatenation: ${stringConcat}"