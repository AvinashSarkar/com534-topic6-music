class RecordPlayer {
    fun play(music: Music) {
        println("Now playing: ${music.javaClass.simpleName}")
        println("Total play time: ${music.getPlayingTime()} seconds")

        println("Track List:")
        music.getAllSongs().forEach { song ->
            println(" - ${song.title} by ${song.artist} (${song.playingTime}s)")
        }

        println()
    }
}