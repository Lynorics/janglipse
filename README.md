
janglipse
=========
[![Build Status](https://secure.travis-ci.org/Lynorics/janglipse.png)](http://travis-ci.org/Lynorics/janglipse)
[![Code Climate](https://codeclimate.com/github/Lynorics/janglipse/badges/gpa.svg)](https://codeclimate.com/github/Lynorics/janglipse)

[Jangaroo](http://www.jangaroo.net) integration for [Eclipse](http://www.eclipse.org/) based upon [Xtext](http://www.xtext.org/)

# License

Janglipse is Licensed under the [Eclipse Public License version 1.0](http://opensource.org/licenses/eclipse-1.0.txt)

# Users

Work in progress, just no release at the moment.

Please visit the [Github Page for janglipse](http://lynorics.github.io/janglipse/).

# Contributors

If you are willing to support this project, follow these instructions.

* check out the project from git
* cd de.lynorics.eclipse.jangaroo.releng
* mvn clean install
* For further onformations on building, read the [official xtext maven project](https://github.com/svenefftinge/maven-xtext-example)

Important files are
* grammar definition: de.lynorics.eclipse.jangaroo/src/de.lynorics.eclipse.jangaroo.AS3.xtext
* validations: de.lynorics.eclipse.jangaroo/src/de.lynorics.eclipse.jangaroo.validation.*
* tests: de.lynorics.eclipse.jangaroo.tests/src
* ui: de.lynorics.eclipse.jangaroo.ui/src

# Installing a snapshot release
Note: a snapshot release may be unstable and involve the stability of your
eclipse installation/data integrity of your source code.
Any usage without warranty and at your own risk.

* Update site http://www.lynorics.de/eclipse

# References

* [Xtext](http://www.xtext.org/)
* [Xtext maven project at github](https://github.com/svenefftinge/maven-xtext-example)
* [Lorenzo Bettini: Implementing Domain-Specific Languages with Xtext and Xtend ](http://www.amazon.de/Implementing-Domain-Specific-Languages-Xtext-Xtend-ebook/dp/B00EPCSD1M/ref=sr_1_1?s=digital-text&ie=UTF8&qid=1394664194&sr=1-1&keywords=Implementing+Domain-Specific+Languages+with+Xtext+and+Xtend)
