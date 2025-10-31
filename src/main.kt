fun main() {
    val song1 = Song("Heroes", "David Bowie", 180.0)
    val song2 = Song("Life on Mars", "David Bowie", 200.0)
    val song3 = Song("Let It Be", "The Beatles", 240.0)
    val song4 = Song("Hey Jude", "The Beatles", 210.0)

    val single = Single(song1, song2)
    val album = Album("Best of the Beatles", "Various", listOf(song3, song4))

    val musicList: List<Music> = listOf(single, album)
    val player = RecordPlayer()

    // Loop through the list and "play" each one
    musicList.forEach { music ->
        player.play(music)
    }
}
