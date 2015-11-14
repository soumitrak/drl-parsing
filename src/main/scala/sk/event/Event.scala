package sk.event

sealed case class Event (time: Long, map: Map [String, String]) {
    def has (key: String, value: String): Boolean = false
}
