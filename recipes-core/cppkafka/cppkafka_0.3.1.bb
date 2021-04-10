DESCRIPTION = "librdkafka - the Apache Kafka C/C++ client library"
HOMEPAGE = "https://github.com/mfontanini/cppkafka"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8b4ca15d239dc1485ef495c8f1bcc72"
LICENSE = "BSD"

SRC_URI = "https://github.com/mfontanini/cppkafka/archive/refs/tags/v0.3.1.tar.gz"
SRC_URI[sha256sum] = "800e32c582ebc3813dbde40c2fccc90229b4d6590d63f75eecf3c81cb6884ad3"

S = "${WORKDIR}/cppkafka-0.3.1"

DEPENDS += "boost"

RDEPENDS_${PN} += "librdkafka"

inherit cmake pkgconfig