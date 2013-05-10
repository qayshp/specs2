package org.specs2
package specification

import Fragments._
import matcher.ThrownExpectations

class FragmentsSpec extends org.specs2.mutable.script.Specification with Groups with ThrownExpectations { s2"""

 A Fragments object contains all the fragments for a given specification.
 It usually has a SpecStart and a SpecEnd and a middle section

 it is possible to append other fragments to the middle section
 + if a piece text is added, it must be concatenated with the previous piece of text if any
 + if fragments with links are added, the links must be preserved

 """

 "append" - new group {
   eg := helloFragments.append(createList(Text(" world"))).texts.headOption must beSome(Text("hello world"))

   eg := {
     val fs = helloFragments.append(create(SpecStart(specName)).linkIs(UrlHtmlLink("a link")).add(Text(" world")).add(SpecEnd(specName)))
     fs.starts.headOption must beSome
     fs.starts.headOption.map(_.name) must beSome("name")
     fs.starts.headOption.flatMap(_.link.map(_.url)) must beSome("a link")
   }
 }

  val helloFragments = createList(Text("hello"))
  val specName = SpecName("name")
}
