/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class X21StandaloneSetup extends X21StandaloneSetupGenerated {

	def static void doSetup() {
		new X21StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}