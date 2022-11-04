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
import patterns.Proportional;

/**
 * This is the item provider adapter for a {@link patterns.Proportional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProportionalItemProvider 
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
	public ProportionalItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Proportional_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Proportional_value_feature", "_UI_Proportional_type"),
				 PatternsPackage.Literals.PROPORTIONAL__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(PatternsPackage.Literals.PROPORTIONAL__MISSION1);
			childrenFeatures.add(PatternsPackage.Literals.PROPORTIONAL__MISSION2);
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
	 * This returns Proportional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Proportional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Proportional proportional = (Proportional)object;
		return getString("_UI_Proportional_type") + " " + proportional.getValue();
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

		switch (notification.getFeatureID(Proportional.class)) {
			case PatternsPackage.PROPORTIONAL__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.PROPORTIONAL__MISSION1:
			case PatternsPackage.PROPORTIONAL__MISSION2:
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
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createMaximize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createMinimize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createAtMost()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createAtLeast()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createStrictlyWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createShallMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createComplexMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createConservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createPreservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createRepeatEvery()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createMaintain()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createResumeIf()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createAccrue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createSecure()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createEquidistance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createTrail()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createTimeout()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createReliabilityConfidence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createRelaxed()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createAlmostAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createExactlyAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createDeadlineAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createProportional()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createExecute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createSequencing()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION1,
				 PatternsFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createMaximize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createMinimize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createAtMost()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createAtLeast()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createStrictlyWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createShallMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createComplexMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createConservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createPreservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createRepeatEvery()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createMaintain()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createResumeIf()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createAccrue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createSecure()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createEquidistance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createTrail()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createTimeout()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createReliabilityConfidence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createRelaxed()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createAlmostAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createExactlyAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createDeadlineAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createProportional()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createExecute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createSequencing()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROPORTIONAL__MISSION2,
				 PatternsFactory.eINSTANCE.createRepeat()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PatternsPackage.Literals.PROPORTIONAL__MISSION1 ||
			childFeature == PatternsPackage.Literals.PROPORTIONAL__MISSION2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
