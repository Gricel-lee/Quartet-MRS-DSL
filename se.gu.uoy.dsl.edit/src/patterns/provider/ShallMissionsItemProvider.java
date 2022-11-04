/**
 */
package patterns.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import patterns.PatternsFactory;
import patterns.PatternsPackage;
import patterns.ShallMissions;

/**
 * This is the item provider adapter for a {@link patterns.ShallMissions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShallMissionsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShallMissionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addRobotsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ShallMissions_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ShallMissions_id_feature", "_UI_ShallMissions_type"),
				 PatternsPackage.Literals.SHALL_MISSIONS__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Robots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRobotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ShallMissions_robots_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ShallMissions_robots_feature", "_UI_ShallMissions_type"),
				 PatternsPackage.Literals.SHALL_MISSIONS__ROBOTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ShallMissions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ShallMissions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ShallMissions)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ShallMissions_type") :
			getString("_UI_ShallMissions_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ShallMissions.class)) {
			case PatternsPackage.SHALL_MISSIONS__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createVisit1()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createStrictOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createPatrol()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createFair()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createVisit2()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createExactly()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createAvoid()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createAfter()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createReact()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createCounteract()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.SHALL_MISSIONS__MOVEMENT_PATTERNS,
				 PatternsFactory.eINSTANCE.createDelayed()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QuantitativePatternsEditPlugin.INSTANCE;
	}

}
