package org.scalaide.core.internal.extensions.autoedits

import org.scalaide.core.text.Document
import org.scalaide.core.text.TextChange
import org.scalaide.extensions.autoedits.JumpOverClosingParenthesis

object JumpOverClosingParenthesisCreator {
  def create(doc: Document, change: TextChange): JumpOverClosingParenthesis =
    new JumpOverClosingParenthesis {
      override val document = doc
      override val textChange = change
    }
}
