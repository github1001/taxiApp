# Taxiapp
Cyclone taxi app

# Latest bugs ..
Sometimes the Talk button makes the application to crash.

# Dummy Values
`BookNowDriverActivity` try catch block enhanced with dummy values so that if an error occurred
it will not crash. Changes made on line numbers 262 - 268 and 327 - 333.

`BookNowDriverActivity` get date time value from the date picker. If parse failed use the dummy
 value (line numbers 681 - 684).

`BookNowUserActivity` set default locations to dummy values in case the location service fails (line
numbers 364-349 and 371 - 374).