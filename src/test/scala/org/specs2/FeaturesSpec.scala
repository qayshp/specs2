package org.specs2
import specification._
import execute._

class FeaturesSpec extends Specification { def is = literate ^
                                                                                          """
  Todo before beta:

  * tests must pass                                      DONE
  * fix the bugs with
    . the display of stats for html nested specs
    . the computing of levels with links
  * package and test as a user
    .
  * prepare an email


 These are the list of features todevelop / port for specs2.

 The prioritization idea is to:

  * check the feasability of specs features in a fully functional programming approach
  * re-evaluate the necessity of some existing features and provide the most important 
    ones first including the ones necessary for a proper development of specs2 itself
  * make sure that
    ** at each step that everything is well specified
    ** dependencies are well-controled
    ** implicits visibility is reduced
    ** specs2 API is kept private unless necessary
                                                                                          """^
  "High priority                                                                          "^
    "A Console reporter                                                                   "^
      "with statistics                                                                    "! done^
      "with stacktraces                                                                   "! done^
      "with output configuration                                                          "^
        "stacktraces on demand                                                            "! done^
        "fail only                                                                        "! done^
    "A specs file runner                                                                  "^
      "reporter all classes on the path                                                   "! done^
      "according to a regular expression                                                  "! done^
      "reporting the final statistics                                                     "! done^
    "A JUnit4 reporter                                                                    "^
      "with nested suites                                                                 "! done^
      "with proper display when the tests have the same name                              "! done^
      "with ComparisonFailure                                                             "! done^
    "Matchers                                                                             " ^
      "with logical combinators                                                           "! done^
      "with nice be, have, not syntax                                                     "! done^
      "with adapters                                                                      "! done^
      "for strings                                                                        "! done^
      "for iterables                                                                      "! done^
      "for maps                                                                           "! done^
      "for classes                                                                        "! todo^
      "for Either                                                                         "! done^
      "for Options/Patterns                                                               "! done^
      "for Files                                                                          "! done^
      "for Numerics                                                                       "! done^
      "for xml                                                                            "! done^
    "Spec for before/after/around                                                         "^
      "before/after                                                                       "! done^
      "example isolation                                                                  "! done^
      "around                                                                             "! done^
      "first/last                                                                         "! done^
      "beforeSpec/afterSpec                                                               "! done^
    "A literate specs environment                                                         "^
      "with an html reporter                                                              "! done^
      "supporting Markdown                                                                "! done^
      "with a table of content                                                            "! todo^
      "with non mutable forms                                                             "! todo^
    "A sbt reporter                                                                       "^
      "based on the console reporter                                                      "! done^
    "Data tables                                                                          "^
      "with ! and | as separators                                                         "! done^
    "Mockito                                                                              "^
      "verification of the calls                                                          "! done^
      "returning stub values                                                              "! done^
      "order of method calls                                                              "! done^
      "with argument capture                                                              "! done^
                                                                                          p^    
  "Low priority                                                                           "^
    "A Console reporter                                                                   "^
      "with a timer                                                                       "! done^
      "with colored output                                                                "! done^
    "StackTraces                                                                          "^
      "for Fragments, to help with IDE navigation                                         "! todo^
      "for all results, even success                                                      "! todo^
      "with source code location                                                          "! done^
      "sanitized                                                                          "! done^
    "Tags                                                                                 "^
      "for examples, groups, specs                                                        "! todo^
      "with dependencies between tags                                                     "! todo^
    "Forms                                                                                "^
      "with a text display                                                                "! done^
    "JMock                                                                                "^
      "with all features                                                                  "! todo^
    "EasyMock                                                                             "^
      "with all features                                                                  "! todo^
    "Detailed diffs                                                                       "^
      "non mutable version                                                                "! todo^
    "Package dependencies specification                                                   "! todo^
    "Auto examples                                                                        "^
      "with the description taken from the source file                                    "! done^
    "Timer                                                                                "^
      "specs-like Timer                                                                   "! done^
      "WaitFor                                                                            "! todo^
    "A ScalaInterpreter                                                                   "^
      "with appropriate matchers                                                          "! todo^
    "ScalaCheck                                                                           "^
      "with all previous features                                                         "! done^
      "with the reporting of expectations                                                 "! done^
    "A Step execution model?                                                              "! todo^
    "A Database facility?                                                                 "! todo^
    "Command line arguments                                                               "^
      "implement an easy to maintain system coherent with the config                      "! done ^
      "can be overriden locally in a specification                                        "! done ^
    "Examples                                                                             "^
      "Stack                                                                              "! done^
      "Specifications layouts                                                             "! todo^
      "Given/When/Then                                                                    "! todo^
      "Arguments                                                                          "! todo^
      "Runners                                                                            "! todo^
      "Expectations: boolean, matchers, properties                                        "! todo^
                                                                                          end
}