This README file contains information on the contents of the
meta-doom layer.

Please see the corresponding sections below for details.


Dependencies
============

This layer depends on:

  URI: git://git.openembedded.org/bitbake
  branch: master

  URI: git://git.openembedded.org/openembedded-core
  layers: meta
  branch: master

  URI: git://git.yoctoproject.org/xxxx
  layers: xxxx
  branch: master


Patches
=======

Please submit any patches against the meta-doom layer through https://github.com/geoffrey-vl/meta-doom


Table of Contents
=================

  I. Adding the meta-doom layer to your build
 II. Misc


## I. Adding the meta-doom layer to your build

In order to use this layer, you need to make the build system aware of
it.

Assuming the meta-doom layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the meta-doom layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-meta-doom \
    "


## II. Misc

This layer provides the Chocolate-doom game engine, a fork of the original doom engine used for the 90's game. The meta-layer also provides Freedoom as free to use game assets. Combined t provides a free-to-play implementation of doom. You may also want to add your own WAD files through your own recipes.

*Note: Get a [shareware WAD](http://www.pc-freak.net/files/doom-wad-files/Doom1.WAD) if you don't own the game.*

![Freedoom Screenshot](freedoom.png)

