val countryCodes =List("US","ZH","KR")
val test1 = "AB123456789ZH"
val test2 = "AB1234UA"
val test3 = "%?1234UA"
//Unit is void in scala, if you need it
def usps(pn :String) : Boolean =
  pn.length == 13 && checkLetters(pn.substring(0,2)) && checkNumbers(pn.substring(3,11)) && checkCountryCode(pn.substring(11,13))

def checkLetters(lp :String) : Boolean =
  lp.forall(_.isLetter)

def checkNumbers(np :String) : Boolean =
  np.forall(_.isDigit)

def checkCountryCode (cp :String) : Boolean =
  countryCodes.contains(cp.toUpperCase)

usps(test1)
usps(test2)
usps(test3)