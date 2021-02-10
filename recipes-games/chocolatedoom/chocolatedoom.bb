DESCRIPTION = "A Doom Clone based on SDL2"
SECTION = "games"
DEPENDS = "virtual/libsdl2 libsdl2-mixer libsdl2-net pkgconfig"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PV = "3.0.1"
PR = "r0"
SRC_URI = "https://github.com/chocolate-doom/chocolate-doom/archive/chocolate-doom-${PV}.tar.gz"
SRC_URI[md5sum] = "ca62d710d546accd2548b48f830f363d"
SRC_URI[sha256sum] = "a54383beef6a52babc5b00d58fcf53a454f012ced7b1936ba359b13f1f10ac66"


inherit autotools-brokensep gettext pkgconfig


S = "${WORKDIR}/chocolate-doom-chocolate-doom-${PV}"



FILES_${PN} = "/usr/share ${bindir}"


