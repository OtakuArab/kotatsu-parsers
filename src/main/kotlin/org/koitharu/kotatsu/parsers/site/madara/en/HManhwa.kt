package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HMANHWA", "HManhwa", "en")
internal class HManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HMANHWA, "hmanhwa.com") {

	override val tagPrefix = "manhwa-genre/"
	override val isNsfwSource = true
	override val datePattern = "dd MMM"
	override val postreq = true

}