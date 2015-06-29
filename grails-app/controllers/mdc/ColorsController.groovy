package mdc

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class ColorsController {

	def springSecurityService

	@Secured(['ROLE_USER'])
    def index() {
    	[
    		pageTitle:"Concept",
    		pageDescription:"Présentation d'un concept intéressant",
    	]
    }

    def questionnary() {
    	[
    		pageTitle:"Concept",
    		pageDescription:"Présentation d'un concept intéressant",
    	]
    }

}
