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

import patterns.DeadlineAt;
import patterns.PatternsFactory;
import patterns.PatternsPackage;

/**
 * This is the item provider adapter for a {@link patterns.DeadlineAt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeadlineAtItemProvider 
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
	public DeadlineAtItemProvider(AdapterFactory adapterFactory) {
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

			addTPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Timed_t_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Timed_t_feature", "_UI_Timed_type"),
				 PatternsPackage.Literals.TIMED__T,
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
			childrenFeatures.add(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS);
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
	 * This returns DeadlineAt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeadlineAt"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DeadlineAt deadlineAt = (DeadlineAt)object;
		return getString("_UI_DeadlineAt_type") + " " + deadlineAt.getT();
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

		switch (notification.getFeatureID(DeadlineAt.class)) {
			case PatternsPackage.DEADLINE_AT__T:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.DEADLINE_AT__MISSIONS:
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
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createMaximize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createMinimize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createAtMost()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createAtLeast()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createStrictlyWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createShallMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createComplexMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createConservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createPreservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createRepeatEvery()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createMaintain()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createResumeIf()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createAccrue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createSecure()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createEquidistance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createTrail()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createTimeout()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createReliabilityConfidence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createRelaxed()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createAlmostAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createExactlyAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createDeadlineAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createProportional()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createExecute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createSequencing()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.MISSION_DEPENDENT__MISSIONS,
				 PatternsFactory.eINSTANCE.createRepeat()));
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
