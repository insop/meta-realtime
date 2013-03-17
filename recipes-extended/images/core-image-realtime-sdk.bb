require recipes-core/images/core-image-minimal-dev.bb

DESCRIPTION = "Image with meta-realtime and sato-sdk"

DEPENDS = "linux-yocto"

IMAGE_FEATURES += "splash package-management x11-base x11-sato hwcodecs"
IMAGE_FEATURES += "dev-pkgs tools-sdk qt4-pkgs \
	tools-debug tools-profile tools-testapps debug-tweaks ssh-server-openssh"

IMAGE_INSTALL = "\
	${CORE_IMAGE_BASE_INSTALL} \
	rt-app \
	schedtool-dl \
	"

IMAGE_INSTALL += "packagegroup-core-x11-sato-games"
IMAGE_INSTALL += "kernel-dev"
