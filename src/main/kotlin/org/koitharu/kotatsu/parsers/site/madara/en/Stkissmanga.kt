package org.koitharu.kotatsu.parsers.site.madara.pt


import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("STKISSMANGA", "Stkissmanga", "en")
internal class Stkissmanga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.STKISSMANGA, "1stkissmanga.me") {

	override val datePattern = "MMMM dd, yyyy"
}