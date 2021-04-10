DESCRIPTION = "librdkafka - the Apache Kafka C/C++ client library"
HOMEPAGE = "https://github.com/edenhill/librdkafka"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=063a1a66c98d6d481589f0a3c3b9d671"
LICENSE = "BSD"

SRC_URI = "https://github.com/edenhill/librdkafka/archive/v1.5.3.tar.gz"
SRC_URI[sha256sum] = "2105ca01fef5beca10c9f010bc50342b15d5ce6b73b2489b012e6d09a008b7bf"

S = "${WORKDIR}/librdkafka-1.5.3"

do_install_append () {
    install -d ${D}${base_libdir}/licences/
    install -m 755 ${S}/LICENSES.txt ${D}${base_libdir}/licences/
}

FILES_${PN} += " \
    /lib \
    /usr/share \
    /usr/share/licenses \
    /usr/share/licenses/librdkafka \
    /usr/share/licenses/librdkafka/LICENSES.txt \
    /lib/licences \
"

RDEPENDS_${PN} += "libcrypto libssl zlib"

inherit cmake pkgconfig