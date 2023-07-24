package org.koitharu.kotatsu.parsers.site.mangareader.id

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser


@MangaSourceParser("KANZENIN", "Kanzenin", "id")
internal class Kanzenin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KANZENIN, "kanzenin.xyz", pageSize = 25, searchPageSize = 25) {

	override val isNsfwSource = true
}