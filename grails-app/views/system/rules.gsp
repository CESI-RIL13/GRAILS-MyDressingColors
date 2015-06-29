<g:render template="/common/head" />
<g:render template="/common/header" />

<g:link controller="system" action="facts">Gérer les faits</g:link>
<g:link controller="system" action="rules">Gérer les règles</g:link>

<form>
<table>
	<tr>
		<th>Id</th>
		<th>Label</th>
		<th>Faits à vérifier</th>
		<th>Faits à prouver</th>
		<th>Opération</th>
	</tr>
	<tr>
		<td>1</td>
		<td>Chaud</td>
		<td>
			<ul>
				<li>Cheveux - Gris</li>
				<li>Teint - Clair</li>
			</ul>
		</td>
		<td>A</td>
		<td><button>Modifier</button><button>Supprimer</button></td>
	</tr>
</table>
</form>

<g:render template="/common/footer" />