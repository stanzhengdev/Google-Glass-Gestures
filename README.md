Google Glass (XE12) Template
=================

Google Glass Boilerplate Template (Built for ADT)

<b>Features:
 - Registers Glassware with Glass Menu ("Test my App")
 - Registers Glassware with Glass Voice Command List ("Test my App")
 - Sets Up Static Card
 - Imports all Necessary Packages
 - Designed to Work with XE12
 
<b>Use as the base framework for Glassware development on XE12

<b>Notable File Location:
 - /res/values/strings.xml
  - Global Variables for 'app_name', and 'glass_voice_triggers' These drive the voice commands and labeling of your Glassware in the Application menu.
 - /res/xml/voice_trigger.xml
  - Set voice trigger keyword - This will inherit our globally defined variable from the strings.xml file
 - /AndroidManifest.xml
  - The Activity tag contains Application name definition (based upon globally defined names) and package/meta-data information 
 
FAQ/Change log<b> 
- This does not have GDK added, should add that or glass wont recognize 
- Manifest added in header "<?xml version="1.0" encoding="utf-8"?>"

<b> original build by.
<b>Carmine Valentino
 - <a href="mailto:cvalentino3@gmail.com">cvalentino3@gmail.com</a><br >
 - <a href="http://www.twitter.com/cvalentino3">Twitter</a><br >
 - <a href="http://plus.google.com/+CarmineValentinoIII">Google +</a><br >
