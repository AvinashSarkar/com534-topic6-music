class Album(val title: String, val artist: String, val songs: List<Song>) : Music {
    fun getSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }

    override fun getPlayingTime(): Double {
        return songs.sumOf { it.playingTime }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    override fun toString(): String {
        return "Album(title='$title', artist='$artist', songs=$songs.size)"
    }
}