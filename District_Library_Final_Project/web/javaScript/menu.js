const menusItemsDropDown = document.querySelectorAll('.menu-item-dropdown');
const sidebar = document.getElementById('sidebar');
const menuBtn = document.getElementById('menu-btn');
const main = document.getElementById('main');

menuBtn.addEventListener('click',()=>{
	sidebar.classList.toggle('minimize');
	main.classList.toggle('minimize');
});

menusItemsDropDown.forEach((menuItem)=>{
	menuItem.addEventListener('click',()=>{
		const subMenu = menuItem.querySelector('.sub-menu'); /*solo vamos a obterne un solo elemento de nuestro menuItem*/
		const isActive = menuItem.classList.toggle('sub-menu-toggle'); /*para saber si está abierto o cerrado*/
		if(subMenu){/*verifica si el elemento existe*/
			if(isActive){
				subMenu.style.height = `${subMenu.scrollHeight + 6}px`;
				subMenu.style.padding = '0.2rem 0';
			}else{
				subMenu.style.height = '0';
				subMenu.style.padding = '0';
			}
		}
	});
});
