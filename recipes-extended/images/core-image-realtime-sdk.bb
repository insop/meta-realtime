require recipes-core/images/core-image-minimal-dev.bb

DESCRIPTION = "Image with meta-realtime and sdk"

DEPENDS = "linux-yocto"

IMAGE_FEATURES += "package-management ssh-server-dropbear"
IMAGE_FEATURES += "dev-pkgs tools-sdk tools-testapps"
EXTRA_IMAGE_FEATURES = "tools-debug debug-tweaks tools-profile dbg-pkgs"

IMAGE_INSTALL = "\
	${CORE_IMAGE_BASE_INSTALL} \
	rt-app \
	schedtool-dl \
	"
IMAGE_INSTALL += "kernel-dev"
