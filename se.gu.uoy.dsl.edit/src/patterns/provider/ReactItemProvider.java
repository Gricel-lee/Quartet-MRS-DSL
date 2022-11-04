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
import patterns.React;

/**
 * This is the item provider adapter for a {@link patterns.React} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactItemProvider 
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
	public ReactItemProvider(AdapterFactory adapterFactory) {
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

			addLocationsPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Locations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecificationPatterns_locations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecificationPatterns_locations_feature", "_UI_SpecificationPatterns_type"),
				 PatternsPackage.Literals.SPECIFICATION_PATTERNS__LOCATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecificationPatterns_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecificationPatterns_type_feature", "_UI_SpecificationPatterns_type"),
				 PatternsPackage.Literals.SPECIFICATION_PATTERNS__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_condition_feature", "_UI_Trigger_type"),
				 PatternsPackage.Literals.TRIGGER__CONDITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Descriptive_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Descriptive_action_feature", "_UI_Descriptive_type"),
				 PatternsPackage.Literals.DESCRIPTIVE__ACTION,
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
			childrenFeatures.add(PatternsPackage.Literals.TRIGGER__LOCATIONEVENT);
			childrenFeatures.add(PatternsPackage.Literals.DESCRIPTIVE__PATTERN);
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
	 * This returns React.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/React"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((React)object).getType();
		return label == null || label.length() == 0 ?
			getString("_UI_React_type") :
			getString("_UI_React_type") + " " + label;
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

		switch (notification.getFeatureID(React.class)) {
			case PatternsPackage.REACT__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.REACT__LOCATIONEVENT:
			case PatternsPackage.REACT__PATTERN:
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
				(PatternsPackage.Literals.TRIGGER__LOCATIONEVENT,
				 PatternsFactory.eINSTANCE.createLocationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createVisit1()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createStrictOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createPatrol()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createFair()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createVisit2()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createExactly()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createAvoid()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createAfter()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createReact()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
				 PatternsFactory.eINSTANCE.createCounteract()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.DESCRIPTIVE__PATTERN,
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
