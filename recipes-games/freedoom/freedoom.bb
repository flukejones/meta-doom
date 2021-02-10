SECTION = "games"
DESCRIPTION = "The Freedoom project aims at collaboratively creating a Free IWAD file.\
	       Combined with the Free source code, this results in a complete game \
	       based on the Doom engine which is Free Software."
HOMEPAGE = "http://freedoom.sourceforge.net/"
PRIORITY = "optional"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=038918b78710d44563f923bd8119f814"

do_unpack[depends] += "unzip-native:do_populate_sysroot"

PV = "0.12.1"

SRC_URI = "https://github.com/freedoom/freedoom/releases/download/v${PV}/freedoom-${PV}.zip"
SRC_URI[md5sum] = "f8c86928394b1d425ef60637b5e8ac31"
SRC_URI[sha256sum] = "f42c6810fc89b0282de1466c2c9c7c9818031a8d556256a6db1b69f6a77b5806"

FILES_${PN} = "${datadir}/games/doom/*"
FILES_${PN}-doc = "${datadir}/doc/freedoom/*"

do_install() {
	install -d ${D}/${datadir}/games/doom

	install -m 0644 ${WORKDIR}/freedoom-${PV}/freedoom1.wad ${D}/${datadir}/games/doom/
	install -m 0644 ${WORKDIR}/freedoom-${PV}/freedoom2.wad ${D}/${datadir}/games/doom/
}

