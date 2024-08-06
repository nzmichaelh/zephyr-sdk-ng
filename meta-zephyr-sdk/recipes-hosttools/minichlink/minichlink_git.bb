SUMMARY = "A free, open mechanism to use the CH-LinkE $4 programming dongle for the CH32V003."
HOMEPAGE = "https://github.com/cnlohr/ch32v003fun"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://minichlink/README.md;md5=c0e0f0423abbeb89556e68ed0b961edd"

DEPENDS = ""

BBCLASSEXTEND += "nativesdk"

SRC_URI = "git://github.com/cnlohr/ch32v003fun.git;protocol=https"
SRCREV = "d8fe188769be7821908751b785e09032e6578a7a"

S = "${WORKDIR}/git/minichlink"

do_compile() {
	oe_runmake minichlink
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/minichlink ${D}${bindir}
}
